import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] side=new int[n];
        int max=-1;
        int num=-1;
        for(int i=0;i<n;i++){
            side[i]=scn.nextInt();
            if(side[i]>max){ 
                max=side[i];
                num=i;
            }
        }   
        int total=0;
        for(int i=0;i<n;i++){
            if(i!=num) total+=side[i];
        }
        if(total>max){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
