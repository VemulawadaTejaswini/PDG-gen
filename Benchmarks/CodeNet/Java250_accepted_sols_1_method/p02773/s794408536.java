import java.util.*;

class Main{

    public Main(){
        int N;
        String S;
        HashMap<String, Integer> HM = new HashMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for(int i=0;i<N;i++){
            S = scanner.next();
            if(HM.containsKey(S)){
                HM.put(S, HM.get(S)+1);
            } else {
                HM.put(S, 1);
            }
        }

        int max=0;
        for(int v : HM.values()){
            if(v > max) max = v;
        }

        ArrayList<String> R = new ArrayList<String>();
        for(Map.Entry<String, Integer> entry : HM.entrySet()) {
            if(entry.getValue() == max)
                R.add(entry.getKey());
        }

		Collections.sort(R);

		for(String str : R){
			System.out.println(str);
		}

    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}
