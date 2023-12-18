import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        int[] a= new int[100];
        for(int i=2; i<=2000; i++){
            for(int j=2; (i%j!=0 && j<i)||j==i; j++){
                if(j==i&&i%5==1){
                    a[c]=i;
                    c++;
                }
            }
        }
        for(int j=0;j<N;j++){
                 System.out.print(a[j]+" ");
        }
    }
}