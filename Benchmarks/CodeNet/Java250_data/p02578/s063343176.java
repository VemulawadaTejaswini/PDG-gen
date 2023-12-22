import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
        int N = Integer.parseInt(str);

                long count=0;
        int prev_person = sc.nextInt();

        for(int i = 1; i < N; i++){
            int now_person = sc.nextInt();
            if(now_person < prev_person){
                count += prev_person - now_person;
            }
            else{
                prev_person = now_person;
            }
        }


                System.out.println(count);
                sc.close();
        }
}

