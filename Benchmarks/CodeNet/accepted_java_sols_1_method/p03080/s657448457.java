import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int aka = 0;
		int ao = 0;
		String akaka = "R";
		for(int i = 0; i < n; i++){
			if(akaka.equals(s.substring(i,i+1))){
				aka++;
			}else{
				ao++;
			}
		}
		System.out.print(aka>ao?"Yes":"No");
	}
}
