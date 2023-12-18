import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

class WindingNumber {
    private ArrayList<Point2D> polygon;

    WindingNumber(ArrayList<Point2D> polygon) {
        this.polygon = polygon;
    }

    private boolean eq(double a,double b) {
        //System.out.println(Math.abs(a-b));
        return Math.abs(a-b) < 0.0001;
    }

    private Point2D sub(Point2D p1,Point2D p2) {
        return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
    }

    private double det(Point2D p1,Point2D p2) {
        return p1.getX() * p2.getY() - p1.getY() * p2.getX();
    }

    private double dot(Point2D p1,Point2D p2) {
        return p1.getX() * p2.getX() + p1.getY() * p2.getY();
    }

    private boolean onSegment(Point2D target,Point2D p1,Point2D p2) {
        return eq(0,det(sub(p1,target),sub(p2,target))) && dot(sub(p1,target),sub(p2,target)) < 1e-10;
    }

    public int isContain(Point2D target) {
        int wn = 0;
        int sz = polygon.size();

        for (int i = 0;i < polygon.size() ;i ++) {
            if (onSegment(target,polygon.get(i),polygon.get((i+1)%sz))) return 1;
        }

        for(int i = 0; i < polygon.size() ; i++){
            // 上向きの辺、下向きの辺によって処理が分かれる。
            // 上向きの辺。点Pがy軸方向について、始点と終点の間にある。ただし、終点は含まない。(ルール1)
            if ( (polygon.get(i).getY() <= target.getY()) && (polygon.get((i+1)%sz).getY() > target.getY()) ) {
                // 辺は点pよりも右側にある。ただし、重ならない。(ルール4)
                // 辺が点pと同じ高さになる位置を特定し、その時のxの値と点pのxの値を比較する。
                double vt = (target.getY() - polygon.get(i).getY()) * (polygon.get((i+1)%sz).getX() - polygon.get(i).getX());
                if(target.getX() < (polygon.get(i).getX() + (vt / (polygon.get((i+1)%sz).getY() - polygon.get(i).getY())))){
                    wn++;  //ここが重要。上向きの辺と交差した場合は+1
                }
            }
            // 下向きの辺。点Pがy軸方向について、始点と終点の間にある。ただし、始点は含まない。(ルール2)
            else if ( (polygon.get(i).getY() > target.getY()) && (polygon.get((i+1)%sz).getY() <= target.getY()) ) {
                // 辺は点pよりも右側にある。ただし、重ならない。(ルール4)
                // 辺が点pと同じ高さになる位置を特定し、その時のxの値と点pのxの値を比較する。
                double vt = (target.getY() - polygon.get(i).getY()) * (polygon.get((i+1)%sz).getX() - polygon.get(i).getX());
                if(target.getX() < (polygon.get(i).getX() + (vt / (polygon.get((i+1)%sz).getY() - polygon.get(i).getY())))){
                    --wn;  //ここが重要。下向きの辺と交差した場合は-1
                }
            }
            // ルール1,ルール2を確認することで、ルール3も確認できている。
        }

        if (wn == 1) {
            return 2;
        }
        else {
             return 0;
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        ArrayList<Point2D> polygon = new ArrayList<Point2D>();
        for(int i=0;i<n;i++){
            double x = stdIn.nextDouble();
            double y = stdIn.nextDouble();
            polygon.add(new Point2D.Double(x, y));
        }
        WindingNumber solve = new WindingNumber(polygon);
        int q = stdIn.nextInt();
        for(int i=0;i<q;i++){
            double x = stdIn.nextDouble();
            double y = stdIn.nextDouble();
            System.out.println(solve.isContain(new Point2D.Double(x,y)));
        }
    }
}


