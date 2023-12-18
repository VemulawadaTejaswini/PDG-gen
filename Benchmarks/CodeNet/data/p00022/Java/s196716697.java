import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        if(num==0) System.exit(0);
        while(true){
            boolean end_flag=false;
            int[] array=new int[num];
            for(int i=0;i<num;i++){
                array[i]=Integer.parseInt(br.readLine());
            }int i=0;
            long sum=0;
            while(i<array.length&&array[i]<0) i++;
            if(i==array.length) end_flag=true;
            while(i<array.length&&!end_flag){
                long minus_sum=0;
                long plus_sum=0;
                while(i<array.length&&array[i]<0){
                    minus_sum+=array[i];
                    i++;
                }while(i<array.length&&array[i]>=0){
                    plus_sum+=array[i];
                    i++;
                }if(plus_sum>(-minus_sum)) sum+=(plus_sum+minus_sum);
            }if(end_flag){
                Arrays.sort(array);
                System.out.println(array[array.length-1]);
            }else System.out.println(sum);
            num=Integer.parseInt(br.readLine());
            if(num==0) System.exit(0);
        }
    }
}