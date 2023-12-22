import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k,l;
        int[] give = new int [n];
        for(i=0;i<n;i++){
            give[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] num = new int [m];
        for(j=0;j<m;j++){
            num[j] = sc.nextInt();
        }
        int cnt=0;
        for(k=0;k<m;k++){
            for(l=0;l<n;l++){
                if(num[k]==give[l]){
                    cnt++;
                    break;
                }
            }       
        }
        System.out.println(cnt);
    }
}

