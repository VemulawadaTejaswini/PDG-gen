    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String l = br.readLine();

            if(l.charAt(2) == l.charAt(3) && l.charAt(4) == l.charAt(5)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }
//int lines = Integer.parseInt(br.readLine());
//
//            for(int i = 0; i < lines; i++){
//                String [] info = br.readLine().split(" ");
//                int n = Integer.parseInt(info[0]);
//                int a = Integer.parseInt(info[1]);
//                int b = Integer.parseInt(info[2]);
//                int c = Integer.parseInt(info[3]);
//                int d = Integer.parseInt(info[4]);
//                int maxSum = n*(a+b);
//                int minSum = n*(a-b);
//                int tMin = c-d;
//                int tMax = c+d;
//
//
//                if((minSum >= tMin && minSum <= tMax) || (maxSum >= tMin && maxSum <= tMax)){
//                    System.out.println("Yes");
//                }
//                else{
//                    System.out.println("No");
//                }
//            }
