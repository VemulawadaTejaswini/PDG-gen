import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			int rank = 13;
			ArrayList<Integer> spade = new ArrayList<Integer>();
			ArrayList<Integer> heart = new ArrayList<Integer>();
			ArrayList<Integer> club = new ArrayList<Integer>();
			ArrayList<Integer> diamond = new ArrayList<Integer>();

			for(int i = 0; i < num; i++){

				String[] token = br.readLine().split(" ");
				String type = token[0];
				int rank_num = Integer.parseInt(token[1]);

				if(type.equals("S")){
					spade.add(rank_num);
				}else if(type.equals("H")){
					heart.add(rank_num);
				}else if(type.equals("C")){
					club.add(rank_num);
				}else if(type.equals("D")){
					diamond.add(rank_num);
				}

			}

			for(int i = 1; i <= rank; i++){
				if(!spade.contains(i)){
					System.out.println("S " + i);
				}
			}

			for(int i = 1; i <= rank; i++){
				if(!heart.contains(i)){
					System.out.println("H " + i);
				}
			}

			for(int i = 1; i <=rank; i++){
				if(!club.contains(i)){
					System.out.println("C " + i);
				}
			}

			for(int i = 1; i <= rank; i++){
				if(!diamond.contains(i)){
					System.out.println("D " + i);
				}
			}

	}
}