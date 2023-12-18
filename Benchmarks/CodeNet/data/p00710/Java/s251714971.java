import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int i,j;
        while(n!=0||r!=0){
            int[] num = new int[n];
            for(i=0;i<n;i++) num[i] = n-i;
            for(i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                if(p-1>=c){
                    int[] tmp = new int[p-1];
                    for(j=0;j<p-1;j++) tmp[j] = num[j];
                    for(j=0;j<c;j++)   num[j] = num[p-1+j];
                    for(j=0;j<p-1;j++) num[c+j] = tmp[j];
                }else{
                    int[] tmp = new int[c];
                    for(j=0;j<c;j++)   tmp[j] = num[p-1+j];
                    for(j=0;j<p-1;j++) num[c+j] = num[j];
                    for(j=0;j<c;j++)   num[j] = tmp[j];
                }
            }
            System.out.println(num[0]);
            n = sc.nextInt();
            r = sc.nextInt();
        }
    }
}
