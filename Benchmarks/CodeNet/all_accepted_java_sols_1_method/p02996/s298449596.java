
import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int [][] tasks = new int[n][2];
        for(int i=0;i<n;i++){
            tasks[i][0]=in.nextInt();
            tasks[i][1]=in.nextInt();
        }

        Arrays.sort(tasks, (a, b)->a[1]-b[1]);
//        for(int i=0;i<n;i++){
//            System.out.println(""+ tasks[i][0] + " " + tasks[i][1]);
//        }
        boolean flag=true;
        int timer=0;
        for(int i=0;i<n;i++){

            timer+=tasks[i][0];
            if(timer>tasks[i][1]) {
                flag = false;
                break;
            }
        }
        if(flag==true)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
