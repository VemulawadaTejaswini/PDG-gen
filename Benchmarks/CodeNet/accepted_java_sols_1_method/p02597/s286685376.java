import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		String s=scn.next();
		char []arr = s.toCharArray();
	    LinkedList<Integer> al =new LinkedList<>();
	    int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='R'){
				al.addFirst(i);
				cnt++;
			}
		}
		int ans=0;
		for(int i=0;i<arr.length;i++){
			if(i<cnt){
				if(arr[i]=='W'){
					ans++;
					int idx = al.removeFirst();
					arr[i]='R';
					arr[idx]='W';
				}
			}
		}
		System.out.println(ans);

	}

}