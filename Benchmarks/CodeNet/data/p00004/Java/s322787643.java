import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        //main.solve();
        main.solve(getSystemInputLine());
    }

    public static void solve(List<String> lines) {
        lines.forEach(line->{
           List<Integer> value = Stream.of(line.split(" ")).map(val->Integer.valueOf(val)).collect(Collectors.toList());
           int a = value.get(0);
           int b = value.get(1);
           int c = value.get(2);
           int d = value.get(3);
           int e = value.get(4);
           int f = value.get(5);

           double x = (b*f-c*e)/(b*d-a*e);
           double y = (a*f-c*d)/(a*e-b*d);
           System.out.printf("%.3f %.3f",x,y);
           System.out.println();
        });
    }

    //public static void solve() {
    //}

    public static List<String> getSystemInputLine() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            list.add(line);
        }
        return list;
    }
}