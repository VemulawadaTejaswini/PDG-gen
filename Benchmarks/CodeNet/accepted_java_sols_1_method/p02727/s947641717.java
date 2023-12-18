import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        Integer red[] = new Integer[n1];
        Integer green[] = new Integer[n2];
        Integer cls[] = new Integer[n3+r+g];

        for(int i=0;i<n1;i++)
            red[i] = sc.nextInt();
        
        for(int i=0;i<n2;i++)
            green[i] = sc.nextInt();
        
        for(int i=0;i<n3;i++)
            cls[i] = sc.nextInt();
        
        Arrays.sort(red,Collections.reverseOrder());
        Arrays.sort(green,Collections.reverseOrder());
        //Arrays.sort(cls,Collections.reverseOrder());

        for(int i=0;i<r;i++){
            cls[n3+i] = red[i];
        }

        for(int i=0;i<g;i++){
            cls[n3+r+i]=green[i];
        }

        Arrays.sort(cls,Collections.reverseOrder());

        long deliciousness = 0;
        for(int i=0;i<r+g;i++){
            deliciousness += cls[i];
        }

        System.out.println(deliciousness);

    }
}