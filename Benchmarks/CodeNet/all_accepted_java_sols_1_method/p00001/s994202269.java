import java.util.Arrays;
//List of Top 3 Hills
import java.util.Scanner;

class Main{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int hight[];
        hight = new int[10];
        
//        System.out.println("hight.length="+hight.length);
        for(int i=0; i<hight.length; i++) {
            hight[i]=sc.nextInt();
        }
//        System.out.println("in end");
        Arrays.sort(hight);

        for(int i=0; i<3; i++) {
            System.out.println(hight[(hight.length-1-i)]);
        }

    }
}