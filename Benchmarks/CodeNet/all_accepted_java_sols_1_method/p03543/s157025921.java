import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		int flg=0,a,b;
		if (n[0]==n[1]&&n[1]==n[2]){
        flg=1;
        }
		if (n[3]==n[1]&&n[1]==n[2]){
        flg=1;
        }
		if (flg==0){
		System.out.print("No");
        }else{
        System.out.print("Yes");
        }
 
    }
}