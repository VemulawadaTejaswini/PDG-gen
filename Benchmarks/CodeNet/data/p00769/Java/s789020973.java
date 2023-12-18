import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			System.out.println(solve(sc.next()));
		}
	}

	static int solve(String str){
		Section root = new Section(null);
		Section current = root;

		int tmpNum = 0;
		for(int i = 1; i < str.length() - 1; i++){
			char c = str.charAt(i);
//			System.out.println(c);

			if(c == '['){
				current = current.add(new Section(current));
			}
			else if(c == ']'){
				if(tmpNum != 0){
					current.add(new Section(current, tmpNum));
//					System.out.println("add "+tmpNum);
					tmpNum = 0;
				}

				current = current.parent;
			}
			//数字
			else {
				tmpNum *= 10;
				tmpNum += c - '0';
			}
		}

		return root.calcSum();
	}

}

class Section implements Comparable<Section>{
	int id;
	static int idseed = 0;
	int sum = 0;
	Vector<Section> sections = new Vector<Section>();
	Section parent;
	int members = 0;

	Section(Section parent){
		this(parent, 0);
	}

	Section(Section parent, int members){
		id = idseed++;
		this.parent = parent;
		this.members = members;

//		System.out.println("id : "+id);
		if(parent != null){
//			System.out.println("my parent is :"+parent.id);
		}
	}

	Section add(Section sec){
		sections.add(sec);

		return sec;
	}

	int calcSum(){
		if(members != 0){
			sum = (members + 1)/2;
//			System.out.println("this is leaf. sum = "+sum);
			return sum;
		}

//		System.out.println("I have "+ sections.size() +" leaves");

		for(int i = 0; i < sections.size(); i++){
			sections.get(i).calcSum();
		}

		Collections.sort(sections);

		for(int i = 0; i < (sections.size() + 1)/2 ; i++){
			this.sum += sections.get(i).sum;
		}

		return sum;
	}

	@Override
	public int compareTo(Section s) {
		return this.sum - s.sum;
	}
}
