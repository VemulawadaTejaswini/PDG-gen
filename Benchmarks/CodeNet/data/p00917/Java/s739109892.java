private static final double MIN_PER_HOUR = 60;
    private static final double FULL_DEGREE = 360;
    private static final double DEGREE_PER_HOUR = FULL_DEGREE / 12;
    private static final double DEGREE_PER_MINITE_HAND = FULL_DEGREE / 60;
    private static final double DEGREE_PER_MINITE = DEGREE_PER_HOUR / MIN_PER_HOUR;

    public double getAngle(double hour, double minute) {
        double hourDegree = (hour%12) * DEGREE_PER_HOUR;
        double hourOffset = (minute%60) * DEGREE_PER_MINITE;
        hourDegree += hourOffset;

        double miniteDegree = minute * DEGREE_PER_MINITE_HAND;

        return Math.abs(miniteDegree - hourDegree);
    }