import java.util.*;

class Hanahuda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> answer = new ArrayList<Integer>();

        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();

            if(n == 0 && r == 0){
                break;
            }

            List<Integer> card = new ArrayList<Integer>();
            for(int i = n-1; i >= 0; i--){
                card.add(i+1);
            }

            for(int i = 0; i < r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();

                int[] tmp = new int[c];
                for(int j = 0; j < c; j++){
                    tmp[j] = card.get(p-1);
                    card.remove(p-1);
                }
                for(int j = tmp.length-1; j >= 0; j--){
                    card.add(0, tmp[j]);
                }
            }
            System.out.println(card.get(0));
        }
        // for(int i = 0; i < answer.size(); i++){
        //     System.out.println(answer.get(i));
        // }
    }
}