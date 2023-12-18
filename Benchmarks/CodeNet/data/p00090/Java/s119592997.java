import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader	br  = null;
	private	static	double			DIF = 1e-6;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Point2D.Double[]			seal  = null;								// シールの座標
		ArrayList<Point2D.Double>	cross = new ArrayList<Point2D.Double>();	// シール同士の交点

		while ((seal = parseSealNum()) != null) {
			int	maxlap = 1;	// シールの重なっている最大枚数

			cross.clear();

			// シールの座標を取得
			for (int loop1 = 0; loop1 < seal.length; loop1++) {
				seal[loop1] = parseSealPoint();
			}

			// シール同士の交点の座標を取得
			for (int loop1 = 0; loop1 < seal.length; loop1++) {
				for (int loop2 = loop1 + 1; loop2 < seal.length; loop2++) {
					Point2D.Double[]	tmp = getCross(seal[loop1], seal[loop2]);
					if (tmp != null) {
						for (int loop3 = 0; loop3 < tmp.length; loop3++) {
							cross.add(tmp[loop3]);
						}
					}
				}
			}

			// シールの重なっている最大枚数を計算する
			for (int loop1 = 0; loop1 < cross.size(); loop1++) {
				Point2D.Double	tmp = cross.get(loop1);
				int				lap = 0;

				for (int loop2 = 0; loop2 < seal.length; loop2++) {
					if (tmp.distance(seal[loop2]) <= 1.0 + DIF) {
						lap++;
					}
				}

				maxlap = Math.max(maxlap, lap);
			}

			System.out.println(maxlap);
		}
	}
 
	private static Point2D.Double[] getCross(Point2D.Double p1, Point2D.Double p2) {
		Point2D.Double[]	cRet = null;

		if (p1 != null && p2 != null) {
			double	length = p1.distance(p2);
			if (length <= DIF) {
				// 二つの円がほぼ同じ位置にある
				cRet    = new Point2D.Double[1];
				cRet[0] = new Point2D.Double(p1.x, p1.y);
			} else if (length <= 2.0 + DIF) {
				// 二つの円が重なっているかもしれない
				double	theta = Math.atan2(p2.y - p1.y, p2.x - p1.x);
				double	alpha = Math.acos(length / 2.0);

				cRet    = new Point2D.Double[2];
				cRet[0] = new Point2D.Double(p1.x + Math.cos(theta + alpha), p1.y + Math.sin(theta + alpha));
				cRet[1] = new Point2D.Double(p1.x + Math.cos(theta - alpha), p1.y + Math.sin(theta - alpha));
			}
		}

		return cRet;
	}
 
	private static Point2D.Double[] parseSealNum() {
		Point2D.Double[]	params = null;
        String				strin  = null;

        if ((strin = parseStdin()) != null) {
        	int	sealnum = Integer.parseInt(strin);
        	if (sealnum > 0) {
            	params = new Point2D.Double[sealnum];
        	}
        }
 
        return params;
	}

	private static Point2D.Double parseSealPoint() {
		Point2D.Double	params = null;
        String			strin  = null;

        if ((strin = parseStdin()) != null) {
        	String[]	lines = strin.split(",");
       		params = new Point2D.Double (Double.parseDouble(lines[0]), Double.parseDouble(lines[1]));
        }
 
        return params;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}