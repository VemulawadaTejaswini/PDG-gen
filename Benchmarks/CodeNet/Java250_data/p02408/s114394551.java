import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	enum priorityFigure{
		S(0),H(1),C(2),D(3);

		private int priority;
		private priorityFigure(int priority){
			this.priority = priority;
		}
	}
	public static void main(String[] args) throws IOException{
		int num, insertionPoint;
		String[] str, list;
		list = new String[52];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();

		num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++){
			str = br.readLine().split(" ");
			if(str[0].equals("S")){
				insertionPoint = priorityFigure.S.priority * 13;
			}else if(str[0].equals("H")){
				insertionPoint = priorityFigure.H.priority * 13;
			}else if(str[0].equals("C")){
				insertionPoint = priorityFigure.C.priority * 13;
			}else{
				insertionPoint = priorityFigure.D.priority * 13;
			}
			list[Integer.parseInt(str[1]) + insertionPoint - 1] = str[1];
		}
		for(int i = 0; i < 52; i++){
			if(list[i] == null){
				String figure;
				if(i / 13 == priorityFigure.S.priority){
					figure = "S";
				}else if(i / 13 ==  priorityFigure.H.priority){
					figure = "H";
				}else if(i / 13 == priorityFigure.C.priority){
					figure = "C";
				}else{
					figure = "D";
				}
				if((i + 1) % 13 == 0){
					num = 13;
				}else{
					num =(i + 1) % 13;
				}
				builder.append(figure + " " + num + "\n");
			}
		}
		if(builder.length()!=0){
			builder.delete(builder.length() - 1, builder.length());
			System.out.println(builder);
		}
		br.close();
	}
}