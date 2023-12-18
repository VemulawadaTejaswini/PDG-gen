import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        while(num!=0){
            int[] array=new int[num];
            for(int i=0;i<num;i++){
                array[i]=Integer.parseInt(br.readLine());
            }int i=0;
            int sum=0;
            while(i<array.length&&array[i]<0) i++;
            while(i<array.length){
                int minus_sum=0;
                int plus_sum=0;
                while(i<array.length&&array[i]<0){
                    minus_sum+=array[i];
                    i++;
                }while(i<array.length&&array[i]>=0){
                    plus_sum+=array[i];
                    i++;
                }if(plus_sum>(-minus_sum)) sum+=(plus_sum+minus_sum);
            }System.out.println(sum);
            num=Integer.parseInt(br.readLine());
        }
    }
}