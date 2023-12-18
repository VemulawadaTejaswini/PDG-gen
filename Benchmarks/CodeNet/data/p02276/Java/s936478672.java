import java.util.*;

public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] sElementArray=sc.nextLine().split(" ");
        int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        sc.close();

   
            int q=partition(array,0,n-1);
            String[] ss=Arrays.stream(array).mapToObj(Integer::toString).toArray(s->new String[s]);
            for(int i=0;i<n;i++){
                if(q==i){
                    System.out.print("["+ss[i]+"]"+" ");
                }else if (i!=n-1){
                    System.out.print(ss[i]+" ");
                }else{
                    System.out.println(ss[i]);
                }
            }
        
            
        }
public static int partition(int[] array,int startIndex,int endIndex){
        // int n=array.length;
        int i=startIndex-1;
        for(int j=startIndex;j<endIndex;j++){
            if(array[j]<=array[endIndex]){
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,endIndex);
        return i;
    }

    public static void swap(int[] array,int i, int j){
                int tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;
    }
    }
    
