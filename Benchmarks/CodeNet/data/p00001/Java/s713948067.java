import java.util.scanner;
class Main{
    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int[] top3 = new int[3];
        for(int i=0;i<10;i++)
            arr[i] = in.nextInt();
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                 if(arr[i]>top3[j]){
                     top3[j]=arr[i];
                     break;
                }
            }
        }
        for(int i=0;i<3;i++)
             System.out.println(top3[i]);
    }
}