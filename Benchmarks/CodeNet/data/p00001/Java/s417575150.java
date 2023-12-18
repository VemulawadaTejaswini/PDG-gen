import java.util.Scanner;
class Main{
    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = in.nextInt();
        for(int i=0;i<3;i++){
            int max=0,tmp;
            for(int j=i+1;j<10;j++){
                if(arr[j]>arr[i])
                  max=j;
            }
            tmp=arr[i];
            arr[i]=arr[max];
            arr[max]=tmp;
        } 
        for(int i=0;i<3;i++)
             System.out.println(arr[i]);
    }
}