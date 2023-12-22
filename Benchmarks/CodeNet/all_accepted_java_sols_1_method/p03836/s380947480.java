import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
        int x = c-a;
        int y = d-b;
		StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<x;i++){sb.append("R");
                            }
        for(int i=0;i<y;i++){sb.append("U");
                              }
        for(int i=0;i<x;i++){sb.append("L");
                            }
        for(int i=0;i<y;i++){sb.append("D");
                             }
        sb.append("D");
        x++;
        y++;
        for(int i=0;i<x;i++){sb.append("R");
                            }
        for(int i=0;i<y;i++){sb.append("U");
                             }
        sb.append("LU");
        for(int i=0;i<x;i++){sb.append("L");
                            }
        for(int i=0;i<y;i++){sb.append("D");
                             }
        sb.append("R");
        String s = sb.toString();
		System.out.println(s);
	}
}
