import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] ans= new int[n-1];
        HashSet<Character> st = new HashSet<Character>();

        sc.close();
        for(int i=1; i<s.length()-1; i++) {
            st.clear();
            ans[i-1] = 0;
            for(int j=0; j<i; j++) {
                for(int k=i; k<s.length(); k++) {
                    if(!(st.contains(s.charAt(j))) && s.charAt(j)==s.charAt(k)) {
                        ans[i-1]++;
                        st.add(s.charAt(j));
                        break;
                    }
                }
            }
        }
        int max = 0;
        for(int i: ans) {
            if(i>max) max=i;
        }
        System.out.println(max);
    }
}