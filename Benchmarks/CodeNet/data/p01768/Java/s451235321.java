import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Material {

	/** この材料のID */
	int fID;

	/** 材料名 */
	String fName;
	/** 価格 */
	int fBuyCost;

	/** この材料を入手するのに必要な最低価格 */
	int fMinCost;

	/** 変換可能な材料：計算時に破壊する */
	HashSet<Integer> fConvertableItem;

	public Material(int id, String name, int buyCost) {
		fID=id;
		fName=name;
		fBuyCost=buyCost;

		fConvertableItem=new HashSet<Integer>();

		fMinCost=buyCost;
	}

	public int getID() {
		return fID;
	}

	public void addConvertableItem(int item) {
		fConvertableItem.add(item);
	}

	public void removeConvatableItem(int item) {
		fConvertableItem.remove(item);
	}

	public int getMinCost() {
		return fMinCost;
	}

	public void setMinCost(int cost) {
		fMinCost=cost;
	}

	public int[] getConvertableItemByList() {
		Integer[] temp=fConvertableItem.toArray(new Integer[fConvertableItem.size()]);
		int[] ret=new int[temp.length];
		for(int i=0; i<ret.length; i++) ret[i]=temp[i];
		return ret;
	}
}

class MaterialComparator implements Comparator<Material> {

	@Override
	public int compare(Material o1, Material o2) {
		return o1.getMinCost()-o2.getMinCost();
	}

}

public class Main {

	Material[] fMaterials;

	HashMap<String, Integer> fInverse;

	public Main(BufferedReader input) throws IOException {

		fMaterials=new Material[Integer.parseInt(input.readLine())];
		fInverse=new HashMap<String, Integer>((int)(fMaterials.length/0.75));
		for(int i=0; i<fMaterials.length; i++) {
			String[] array=input.readLine().split(" ");
			fMaterials[i]=new Material(i, array[0], Integer.parseInt(array[1]));
			fInverse.put(array[0], i);
		}

		int m=Integer.parseInt(input.readLine());
		for(int i=0; i<m; i++) {
			String[] array=input.readLine().split(" ");
			int itemA=fInverse.get(array[0]);
			int itemB=fInverse.get(array[1]);
			fMaterials[itemA].addConvertableItem(itemB);
			fMaterials[itemB].addConvertableItem(itemA);
		}

	}

	public void calculateAllCheapest() {

		LinkedList<Material> tempMaterials=new LinkedList<Material>();
		for(int i=0; i<fMaterials.length; i++)
			tempMaterials.add(fMaterials[i]);

		while(!tempMaterials.isEmpty()) {

			Collections.sort(tempMaterials, new MaterialComparator());

			Material target=tempMaterials.pollFirst();
			for(int i: target.getConvertableItemByList()) {
				fMaterials[i].removeConvatableItem(target.getID());
				if(fMaterials[i].getMinCost()<target.getMinCost()) {
					System.out.println("error! algorithm or program is incorrect.");
				}
				fMaterials[i].setMinCost(target.getMinCost());
			}

		}
	}

	public int getResult() {
		int sum=0;
		for(int i=0; i<fMaterials.length; i++)
			sum+=fMaterials[i].getMinCost();
		return sum;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);

		Main main=new Main(br);
		main.calculateAllCheapest();
		System.out.println(main.getResult());
	}
}