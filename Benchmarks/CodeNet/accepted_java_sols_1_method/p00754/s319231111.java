import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String row;
            while(!(row = scn.nextLine()).equals(".")) {
                row = row.replaceAll("[^\\(\\)\\[\\]]", "");
                while(row.indexOf("()") >= 0 || row.indexOf("[]") >= 0) {
                    row = row.replaceAll("(\\(\\))|(\\[\\])", "");
                }
                System.out.println(row.length() > 0 ? "no" : "yes");
            }
        }
    }
}