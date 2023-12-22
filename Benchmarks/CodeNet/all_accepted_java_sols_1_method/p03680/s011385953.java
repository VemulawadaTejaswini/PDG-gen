import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)a[i]=sc.nextInt();
        int marker = 1,count=0;
        boolean tmp = false;
        for(int i = 0;i<n;i++){
            marker = a[marker-1];
            count++;
            if(marker==2){
                tmp =true;
                break;
            }
        }
        System.out.println(tmp?count:-1);
    }
}
