import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			Item[] items = new Item[n];
			for(int i = 0 ; i < n ; i++){
				items[i] = new Item(sc.next(), sc.nextInt());
			}
			int m = sc.nextInt();
			for(int i = 0 ; i < m ; i++){
				Item item = getItem(items, sc.next());
				int k = sc.nextInt();
				Item[] list = new Item[k];
				for(int j = 0 ; j < k ; j++){
					list[j] = getItem(items,sc.next());
				}
				item.setMaterial(list);
			}
			boolean flag = true;
			while(flag){
				flag = false;
				for(Item item: items){
						flag |= item.calcprice();
				}
			}
			System.out.println(getItem(items, sc.next()).price);
			n = sc.nextInt();
		}
		sc.close();
	}
	static Item getItem(Item[] items, String name){
			for(Item item: items){
				if(item.name.equals(name)){
						return item;
				}
			}
			return null;
	}
}
class Item{
	int price;
	String name;
	Item[] materials;
	Item(String name, int price){
		this.name = name;
		this.price = price;
		materials = null;
	}
	void setMaterial(Item[] materials){
		this.materials = materials;
	}
	boolean calcprice(){
		if(materials != null){
			int sum = 0;
			for(Item item: materials){
				sum += item.price;
			}
			if(sum < price){
					price = sum;
					return true;
			}
		}
		return false;
	}
}