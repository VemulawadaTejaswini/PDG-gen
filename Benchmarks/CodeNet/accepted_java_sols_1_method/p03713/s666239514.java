import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long H = in.nextInt();
            long W = in.nextInt();

            long min = (long) 1e18;
            for (long h1 = 1; h1 < H; h1++) {
                long area1 = h1 * W;
                {
                    long h2 = (H - h1) / 2;
                    long area2 = h2 * W;
                    long h3 = H - (h1 + h2);
                    long area3 = h3 * W;
                    long maxArea = Math.max(area1, Math.max(area2, area3));
                    long minArea = Math.min(area1, Math.min(area2, area3));
                    min = Math.min(min, maxArea - minArea);
                }
                {
                    long w2 = W / 2;
                    long area2 = (H - h1) * w2;
                    long w3 = W - w2;
                    long area3 = (H - h1) * w3;
                    long maxArea = Math.max(area1, Math.max(area2, area3));
                    long minArea = Math.min(area1, Math.min(area2, area3));
                    min = Math.min(min, maxArea - minArea);
                }
            }
            for (long w1 = 1; w1 < W; w1++) {
                long area1 = H * w1;
                {
                    long w2 = (W - w1) / 2;
                    long area2 = H * w2;
                    long w3 = W - (w1 + w2);
                    long area3 = H * w3;
                    long maxArea = Math.max(area1, Math.max(area2, area3));
                    long minArea = Math.min(area1, Math.min(area2, area3));
                    min = Math.min(min, maxArea - minArea);
                }
                {
                    long h2 = H / 2;
                    long area2 = h2 * (W - w1);
                    long h3 = H - h2;
                    long area3 = h3 * (W - w1);
                    long maxArea = Math.max(area1, Math.max(area2, area3));
                    long minArea = Math.min(area1, Math.min(area2, area3));
                    min = Math.min(min, maxArea - minArea);
                }
            }

            System.out.println(min);
        }
    }
}
