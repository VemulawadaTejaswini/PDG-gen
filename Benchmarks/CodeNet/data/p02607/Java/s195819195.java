import java.util.*;

    class Nader {
    public static void main(String[] args) {
        
        int N,a;
        
        int count = 0;

        ArrayList<Integer> A = new ArrayList<>();

        Scanner input = new Scanner(System.in);

         N = input.nextInt();

        while (N != 0){
             a = input.nextInt();
            A.add(a);
            N--;

        } for (int i =0; i< A.size(); i += 2){

            if (A.get(i) % 2 !=0){

              count++;

            }
        }
        System.out.print(count);

    }
}
