import java.util.*;
public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] sArray = sc.nextLine().split(" ");
        int[] array=Arrays.stream(sArray).mapToInt(Integer::parseInt).toArray();

        //選択ソート
        int i,j;
        int count=0;
        for(i=0;i<n;i++){
            int minj=i;
            for(j=i;j<n;j++){
                if(array[j]<array[minj]){
                    minj=j;
                }
            }
            if(minj!=i){
                int tmp=array[i];
                array[i]=array[minj];
                array[minj]=tmp;
                count++;
            }
        }
        String[] sArray2 = Arrays.stream(array).mapToObj(Integer::toString).toArray(s->new String[s]);
        System.out.println(String.join(" ", sArray2));
        System.out.println(count);
    }
}
