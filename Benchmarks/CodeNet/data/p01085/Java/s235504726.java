import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class  Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            int nMin = scan.nextInt();
            int nMax = scan.nextInt();
            if(m==0 && nMin==0 && nMin==0){
                break;
            }
            Integer[] data= new Integer[m];
            for(int i=0;i<m;i++){
                data[i]=scan.nextInt();
            }
            Arrays.sort(data, Collections.reverseOrder());
            int[] ans={-1,-1};
            for(int i=nMin;i<=nMax;i++){
                int gap=data[i-1]-data[i];
                if(gap>=ans[0]){
                    ans[0]=gap;
                    ans[1]=i;
                }
//                for(int j=0;j<i;j++){
//                    System.out.println("ue="+j);
//                }
//                for(int j=i;j<m;j++){
//                    System.out.println("sita="+j);
//                }
//                System.out.println("");
            }
            System.out.println(ans[1]);
        }
    }
}
