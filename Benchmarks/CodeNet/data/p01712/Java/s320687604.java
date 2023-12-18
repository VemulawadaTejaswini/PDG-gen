import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BufferedImage image = new BufferedImage(in.nextInt(), in.nextInt(), BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D g = image.createGraphics();
		g.setColor(Color.RED);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.BLUE);
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int w = in.nextInt();
			g.fillRect(x - w, 0, w * 2, 100000);
			g.fillRect(0, y + w, 100000, w * 2);
		}
		g.dispose();
		BufferedImage img2 = new BufferedImage(1, 1, image.getType());
		img2.createGraphics().drawImage(image.getScaledInstance(1, 1, Image.SCALE_AREA_AVERAGING), 0, 0, null, null);
		if (Color.blue.getRGB() == img2.getRGB(0, 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}