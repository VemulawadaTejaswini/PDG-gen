import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> p_list = new ArrayList<>();
        boolean[] isntP = new boolean[55556];
        for(int i = 2; i < isntP.length; i++) {
            if(!isntP[i]) {
                p_list.add(i);
                for(int j = i + i; j < isntP.length; j += i) {
                    isntP[j] = true;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < p_list.size(); i++) {
            if(p_list.get(i) % 5 == 1) {
                ans.add(p_list.get(i));
            }
        }

        System.out.print(ans.get(0));
        for(int i = 1; i < n; i++) {
            System.out.print(" " + ans.get(i));
        }
        System.out.println();
    
    }
}