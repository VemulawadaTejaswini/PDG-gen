import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = sc.nextInt();
        String blank = sc.nextLine();

        for (int i=0;i<length;i++) {
        	String s = sc.nextLine();
        	String[] orders = s.split(" ");
        	String order = orders[0];
        	if ("print".equals(order)) {
        		print(str,Integer.parseInt(orders[1]),Integer.parseInt(orders[2]));
        	} else if ("reverse".equals(order)) {
        		str = reverse(str,Integer.parseInt(orders[1]),Integer.parseInt(orders[2]));
        	} else if ("replace".equals(order)) {
        		str = replace(str,Integer.parseInt(orders[1]),Integer.parseInt(orders[2]),orders[3]);
        	}

        }
        sc.close();
	}

	public static void print (String str,int from, int to)
	{
		System.out.println(str.substring(from,to + 1));
	}

	public static String reverse (String str,int from, int to)
	{
		String[] strArry = str.split("");
		int length = to - from + 1;
		int n = length / 2;
		for (int i=0;i<n;i++) {
			String w = strArry[from];
			strArry[from] = strArry[to];
			strArry[to] = w;
			from++;
			to--;
		}
		return String.join("", strArry);
	}

	public static String replace (String str,int from, int to,String r)
	{
		String[] strArry = str.split("");
		String[] rArry = r.split("");
		int n = 0;
		for (int i=from;i<=to;i++) {
			strArry[i] = rArry[n++];
		}
		return String.join("", strArry);
	}
}
