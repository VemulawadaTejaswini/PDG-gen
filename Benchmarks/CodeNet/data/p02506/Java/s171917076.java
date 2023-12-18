import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String target = scanner.nextLine();
		StringBuilder builder = new StringBuilder();
		while(scanner.hasNext()){
			String line=scanner.nextLine();
			if(!line.equals("END_OF_TEXT")){
				builder.append(line);
				System.out.println(line);
			}else{
				break;
			}
		}
		String[] text = builder.toString().replace(".", " ").split(" ");
		int count=0;
		for(String s : text){
			if(s.equals(target)){
				count++;
			}
		}
		System.out.println(count);
	}

}