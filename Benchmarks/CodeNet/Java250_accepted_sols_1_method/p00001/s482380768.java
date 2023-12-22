import java.util.Scanner;

class Main{
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        int[] data = new int[3];
        int tmp;
        for(int i=0;i<10;i++){
            tmp=scan.nextInt();
            for(int j=0;j<3;j++){
                if(data[j]<=tmp){
                    for(int k=2;k>j;k--){
                        data[k]=data[k-1];
                    }
                    data[j]=tmp;
                    break;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(data[i]);
        }
    }
}