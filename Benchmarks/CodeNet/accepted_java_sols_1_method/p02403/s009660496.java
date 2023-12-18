import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String[]> list = new ArrayList<String[]>();
    while(true) {
        String line = sc.nextLine();
        String[] linesp = line.split(" ");
        if(linesp[0].equals("0") && linesp[1].equals("0")) {
            break;
        }
        list.add(linesp);
    }
    for(int i = 0; i < list.size(); i++) {
        int h = Integer.parseInt(list.get(i)[0]);
        int w = Integer.parseInt(list.get(i)[1]);
        for(int j = 0; j < h; j++) {
            for(int k = 0; k < w; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println("");
    }
  }
}
