import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList< ArrayList<int[]>> people = new ArrayList<ArrayList<int[]>>();

        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            ArrayList<int[]> say = new ArrayList<int[]>();
            for(int j = 0; j < A; j++){
                say.add(new int[]{sc.nextInt() - 1, sc.nextInt()});
            }
            people.add(say);
        }

        boolean[] honest = new boolean[N];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < (Math.pow(2 ,N)); i++) {
            Arrays.fill(honest, false);
            int count = 0;

            for (int j = 0; j < N; j++) {
                if ((1 & i >> j) == 1){
                    honest[j] = true;
                    count++;
                }
            }

            boolean flag = true;
            for(int j = 0; j < N; j++){
                if(honest[j]){
                    for(int k = 0; k < people.get(j).size(); k++){
                        if(people.get(j).get(k)[1] == 1 && !honest[ people.get(j).get(k)[0] ])
                            flag = false;
                        if(people.get(j).get(k)[1] == 0 && honest[ people.get(j).get(k)[0] ])
                            flag = false;
                    }
                }
            }
            if(flag)max = Math.max(max, count);
        }
        System.out.println(max);
    }
}