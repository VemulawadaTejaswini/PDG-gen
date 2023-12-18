import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
      int x = scan.nextInt();
      int left = -k+x+1;
        int right = k+x-1;
      for(int i=left;i<=right;i++){
        System.out.print(i+" ");
      }
	}
}
