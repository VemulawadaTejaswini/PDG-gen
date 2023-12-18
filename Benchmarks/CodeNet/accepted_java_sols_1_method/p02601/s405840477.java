import java.util.*;

public class Main {
  
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
    	int red = Integer.parseInt(lines[0]);
    	int green = Integer.parseInt(lines[1]);
    	int blue = Integer.parseInt(lines[2]);
      	line = sc.nextLine();
      	int max = Integer.parseInt(line);
		int count = 0;
      	
     	while (red >= green) {
          green *= 2;
          count++;
        }
     	while (green >= blue) {
          blue *= 2;
          count++;
        }
      
      	if (count > max) {
          	System.out.println("No");
        } else {
          	System.out.println("Yes");
        }
	}
}