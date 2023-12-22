    import java.util.ArrayDeque;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Deque;
    import java.util.List;
    import java.util.Scanner;

    //
    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int wk =0;
            int ans =0;
            ans=N/2;
            wk=N%2;
            if(wk==1){ans=ans+1;

            }

        System.out.println(ans);
        }
    }