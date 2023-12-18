import java.util.*;

public class Main {

    public static void main(String args[]) throws ArrayIndexOutOfBoundsException{


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

//        int b[] = new int[n];
        List<Integer> b = new ArrayList<>();
        for (int i=0; i<n; i++) b.add(sc.nextInt());

        List<Integer> ans = new ArrayList<>();

        while(!(b.isEmpty())){

            int tmp = -1;
            for (int i=0; i<b.size(); i++) {
                if (b.get(i) == i + 1) {
                    tmp = i;
                }
            }
                if (tmp==-1){
                    System.out.println("-1");
                    break;
                }
                b.remove(tmp);
                ans.add(tmp+1);
            }
//            for (int i=n-1; i>=0; i--){
//                if (b.get(i)==i+1){
//                    ans.add(b.get(i));
//                    b.remove(i);
//                    n = b.size();
//                }
//            }

        Collections.reverse(ans);
        if (n==ans.size()) {
            for (int i : ans) {
                System.out.println(i);
            }
        }

//        for (int i=ans.size()-1; i>=0; i--){
//            System.out.println(ans.get(i));
//        }


//        int output[] = new int[n];



    }

}

