import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
	  Scanner stdIn = new Scanner(System.in);
	  try {
		  String preContestName = stdIn.next();
		  if (!preContestName.equals("ABC") && !preContestName.equals("ARC")) return;
		  char[] postContestName = preContestName.toCharArray();
		  if (postContestName[1] == 'B') {
			  postContestName[1] = 'R';
		  } else if (postContestName[1] == 'R') {
			  postContestName[1] = 'B';
		  }
		  System.out.println(postContestName);
	  } catch (Exception e) {
		  e.printStackTrace();
	  } finally {
		  stdIn.close();
	  }
  }
}