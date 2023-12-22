import java.util.Scanner;;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int add = 0;
        int[] array = new int[3];
        for(int i=0; i < 3; i++){
            array[i] = sc.nextInt();
            add = add + array[i];
        }
        if(add >= 22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }
    }
}