import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int count = 0;
        for(int i=0;i<n;i++){//each idx

            char ac = a.charAt(i);
            char bc = b.charAt(i);
            char cc = c.charAt(i);

            if(ac==bc && ac==cc){
                //no count
            }else if(ac==bc || bc==cc || ac==cc){
                count++;
            }else{
                count++;
                count++;
            }

        }

        System.out.println(count);
    }

}