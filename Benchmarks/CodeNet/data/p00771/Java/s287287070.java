import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static double EPS = 1e-7;
	
	public static int[][] move_dir = new int[][]{
		{0, 0},
		{1, 0},
		{0, 1},
		//{1, 1},
		{-1, 0},
		{0, -1},
		//{-1, -1}
	};
	
	public static double max_z2(final int n, final double x, final double y, final double sx, final double sy, ArrayList<Double> xs, ArrayList<Double> ys, ArrayList<Double> rs){
		final double next_x_pos = x + sx;
		final double next_y_pos = y + sy;
		double current_z2 = Double.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			final double dx = Math.abs((next_x_pos - xs.get(i)));
			final double dy = Math.abs((next_y_pos - ys.get(i)));
			final double r2 = rs.get(i) * rs.get(i);
			final double dr2 = dx * dx + dy * dy;
			double z2 = r2 - dr2;
			
			current_z2 = Math.min(current_z2, z2);
		}
		
		return current_z2;
	}
	
	public static double check(final int start_pos, final int n, ArrayList<Double> xs, ArrayList<Double> ys, ArrayList<Double> rs){
		double x_pos = start_pos >= 0 ? xs.get(start_pos) : 0;
		double y_pos = start_pos >= 0 ? ys.get(start_pos) : 0;
		
		double z2_pos = 0;
		while(true){
			double max_z2_pos = 0;
			double sx = 0, sy = 0;
			
			for(int move[] : move_dir){
				final double _sx = move[0] * EPS;
				final double _sy = move[1] * EPS;
				final double current_z2 = max_z2(n, x_pos, y_pos, _sx, _sy, xs, ys, rs);
				
				if(max_z2_pos < current_z2){
					max_z2_pos = current_z2;
					sx = move[0] * EPS;
					sy = move[1] * EPS;
				}
			}
			
			if(max_z2_pos <= z2_pos){
				break;
			}
			
			while(true){
				final double next_z2 = max_z2(n, x_pos, y_pos, sx * 2, sy * 2, xs, ys, rs);
				//System.out.println(next_z2);
				if(next_z2 <= max_z2_pos){
					break;
				}
				sx *= 2;
				sy *= 2;
				max_z2_pos = next_z2;
			}
			
			z2_pos = max_z2_pos;
			x_pos += sx;
			y_pos += sy;
		}
		
		final double z_pos = Math.sqrt(z2_pos);
		//System.out.println(start_pos + ": " + "(" + x_pos + ", " + y_pos + ", " + z_pos + ")");
		return z_pos;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			final int n = sc.nextInt();
		
			if(n == 0){
				break;
			}
			
			ArrayList<Double> xs = new ArrayList<Double>();
			ArrayList<Double> ys = new ArrayList<Double>();
			ArrayList<Double> rs = new ArrayList<Double>();
			
			for(int i = 0; i < n; i++){
				xs.add(sc.nextDouble());
				ys.add(sc.nextDouble());
				rs.add(sc.nextDouble());
			}
			
			double z_pos = check(-1, n, xs, ys, rs);
			
			System.out.println(z_pos);
		}
		
		sc.close();
	}
}