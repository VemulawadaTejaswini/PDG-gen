import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] price=new int[n];
        int max=-1;
        int place=-1;
        for(int i=0;i<n;i++){
            price[i]=scn.nextInt();
            if(max<price[i]){
                place=i;
                max=price[i];
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            if(i==place){
                total+=price[i]/2;
            }else{
                total+=price[i];
            }
        }
        System.out.println(total);
    }
}
