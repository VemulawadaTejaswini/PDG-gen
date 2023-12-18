import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int m = scan.nextInt(); //????????????????????°
		for(int i=0;i<m;i++){
			String train = scan.next();
			for(int j=1;j<train.length();j++){
				String front = train.substring(0,j);
				String back = train.substring(j,train.length());
				//System.out.println(j+"front="+front);
				//System.out.println(j+"back="+back);
				StringBuffer front_reverse = new StringBuffer(front);
				StringBuffer back_reverse = new StringBuffer(back);
				front_reverse.reverse(); 
				back_reverse.reverse();
				String front_rev = new String(front_reverse);
				String back_rev = new String(back_reverse);
				//System.out.println(j+"revfront="+front_rev);
				//System.out.println(j+"revback="+back_rev);
				//String conect = front+back;
				//System.out.println(j+conect);
				for(int k=0;k<2;k++){
					for(int l=0;l<2;l++){
						for(int n=0;n<2;n++){
							String conect = new String();
							if     (k==0 && l==0 && n==0) conect = front + back;
							else if(k==0 && l==0 && n==1) conect = front + back_rev;
							else if(k==0 && l==1 && n==0) conect = back + front;
							else if(k==0 && l==1 && n==1) conect = back + front_rev;
							else if(k==1 && l==0 && n==0) conect = front_rev + back;
							else if(k==1 && l==0 && n==1) conect = front_rev + back_rev;
							else if(k==1 && l==1 && n==0) conect = back_rev + front;
							else if(k==1 && l==1 && n==1) conect = back_rev + front_rev;
							list.add(conect);
						}
					}
				}
			}
			//System.out.println(list);
			HashSet<String> hashSet = new HashSet<String>();
			hashSet.addAll(list);
			System.out.println(hashSet.size());
			list.clear();
		}
	}
}