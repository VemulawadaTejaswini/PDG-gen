import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] List = new int[n];
        for(int i=0;i<n;i++) List[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            /**未ソート部分の先頭要素の選択*/
            int v = List[i];
            int j = i-1;
            /**vを挿入し、大小関係が成り立つまで要素を後ろに移動する*/
            while(j>=0&&List[j]>v){
                List[j+1] = List[j];
                j--;
            }
            List[j+1]=v;
            for(int k=0;k<n;k++){
                System.out.print(List[k]);
                if(k!=n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
