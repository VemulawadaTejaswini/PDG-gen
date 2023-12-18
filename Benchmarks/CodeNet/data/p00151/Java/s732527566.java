import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			char[][] map = new char[n][n];
			for (int i = 0; i < n; i++) {
				map[i] = sc.next().toCharArray();
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == '1') {
						int dx[] = { 0, 1, 1, -1 };
						int dy[] = { 1, 0, 1, 1 };
						for (int k = 0; k < 4; k++) {
							int nx = j + dx[k];
							int ny = i + dy[k];
							int c = 1;
							while (nx >= 0 && ny >= 0 && nx < n && ny < n
									&& map[ny][nx] == '1') {
								nx += dx[k];
								ny += dy[k];
								c += 1;
							}
							ans = Math.max(ans, c);
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}
// loop do
// n = gets.to_i
// break if n==0
// map = Array.new(n).map!{Array.new(n)}
// n.times do |i|
// map[i]=gets.chomp.split("")
// end
// ans =0
// n.times do |y|
// n.times do |x|
// if(map[y][x]=="1")
// dx=[0,1,1,-1]
// dy=[1,0,1,1]
// 4.times do |i|
// nx = x + dx[i]
// ny = y + dy[i]
// c=1
// while(nx>=0&&ny>=0&&nx<n&&ny<n&&map[ny][nx]=="1")
// nx+=dx[i]
// ny+=dy[i]
// c+=1
// end
// ans = [ans,c].max
// end
// end
// end
// end
// puts ans
// end