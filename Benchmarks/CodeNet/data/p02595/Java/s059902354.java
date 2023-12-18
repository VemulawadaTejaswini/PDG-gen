int n = in.nextInt();
long d = in.nextInt();
d = d * d;
Point[] points = Point.readPoints(in, n);

int answer = 0;
for (Point p : points) {
    if (p.x * p.x + p.y * p.y <= d)
        answer++;
}

out.println(answer);