import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        	for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
       		 for(int j=1;j<=n;j++){
                 System.out.print(a[n-j]);
                 if(j != n){
                 System.out.print(" ");
                 }
             }
        System.out.println();
        sc.close();
    }
}
