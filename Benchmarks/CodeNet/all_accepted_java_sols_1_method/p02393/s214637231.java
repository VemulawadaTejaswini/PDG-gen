import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array=new int[3];
        int i,t,j;
        for(i=0;i<3;i++){
            array[i] = sc.nextInt();
        }
        for(i=0;i<3;i++){
            for(j=i+1;j<3;j++){
                if(array[i]>array[j]){
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
 
        System.out.println(array[0]+" "+array[1]+" "+array[2]);
    }
}
